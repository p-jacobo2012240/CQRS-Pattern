    public Workflow getWorkflowById(String workflowId, boolean includeTasks) {
        Workflow workflow = executionDAO.getWorkflow(workflowId, includeTasks);
        if (workflow == null) {
            LOGGER.debug("Workflow {} not found in executionDAO, checking indexDAO", workflowId);
            String json = indexDAO.get(workflowId, RAW_JSON_FIELD);
            if (json == null) {
                String errorMsg = String.format("No such workflow found by id: %s", workflowId);
                LOGGER.error(errorMsg);
                throw new ApplicationException(ApplicationException.Code.NOT_FOUND, errorMsg);
            }

            try {
                workflow = objectMapper.readValue(json, Workflow.class);
                if (!includeTasks) {
                    workflow.getTasks().clear();
                }
            } catch (IOException e) {
                String errorMsg = String.format("Error reading workflow: %s", workflowId);
                LOGGER.error(errorMsg);
                throw new ApplicationException(ApplicationException.Code.BACKEND_ERROR, errorMsg, e);
            }
        }
        return workflow;
    }