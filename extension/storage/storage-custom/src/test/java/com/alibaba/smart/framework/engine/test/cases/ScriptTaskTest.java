package com.alibaba.smart.framework.engine.test.cases;

import com.alibaba.smart.framework.engine.model.assembly.ProcessDefinition;
import com.alibaba.smart.framework.engine.test.delegation.BasicServiceTaskDelegation;
import org.junit.Test;

public class ScriptTaskTest extends CustomBaseTestCase {

    @Test
    public void test() throws Exception {
        BasicServiceTaskDelegation.resetCounter();


        ProcessDefinition processDefinition = repositoryCommandService.deploy("script-task-extension-test.xml").getFirstProcessDefinition();
        processCommandService.start("script-process","1.0.0");
    }



}
