package com.qaprosoft.carina.demo;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.APIMethodPoller;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.api.GetTodoMethods;
import com.qaprosoft.carina.demo.api.PatchTodoMethods;
import com.qaprosoft.carina.demo.api.PostTodoMethods;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class APITest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

//    @Test()
//    @MethodOwner(owner = "API test")
//    public void testPatchTodo() throws Exception {
//        PatchTodoMethods patchTodoMethods = new PatchTodoMethods();
//        patchTodoMethods.setProperties("api/todos/todos.properties");
//        patchTodoMethods.callAPIExpectSuccess();
//        patchTodoMethods.validateResponse();
//    }


    @Test()
    @MethodOwner(owner = "Api test")
    public void testCreateTodo(){
        LOGGER.info("test");
        PostTodoMethods postTodoMethods = new PostTodoMethods();
        postTodoMethods.setProperties("api/todos/todos.properties");
        postTodoMethods.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "Api test")
    public void testGetTodo(){
        GetTodoMethods getTodoMethods = new GetTodoMethods();
        getTodoMethods.callAPIExpectSuccess();
        getTodoMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getTodoMethods.validateResponseAgainstSchema("api/todos/_get/rs.schema");
    }
}
