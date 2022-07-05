package com.qaprosoft.carina.demo;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.APIMethodPoller;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.api.GetTodoMethods;
import com.qaprosoft.carina.demo.api.PatchTodoMethods;
import com.qaprosoft.carina.demo.api.PostTodoMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class APITest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @Test()
    @MethodOwner(owner = "API test")
    public void testPatchTodo() throws Exception {
        PostTodoMethod api = new PostTodoMethod();
        api.setProperties("api/todos/todo.properties");

        AtomicInteger counter = new AtomicInteger(0);
        api.callAPIWithRetry().withLogStrategy(APIMethodPoller.LogStrategy.ALL).peek(rs -> counter.getAndIncrement())
                .until(rs -> counter.get() == 5).pollEvery(1, ChronoUnit.SECONDS).stopAfter(8, ChronoUnit.SECONDS)
                .execute();
        api.validateResponse();

        PatchTodoMethods apiPatch = new PatchTodoMethods();
        apiPatch.setProperties("api/todos/todo.properties");
        apiPatch.callAPIExpectSuccess();
        apiPatch.validateResponseAgainstSchema("api/todos/_get/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "")
    public void testPostTodo() throws Exception {
        PostTodoMethod api = new PostTodoMethod();
        api.setProperties("api/todos/todo.properties");

        AtomicInteger counter = new AtomicInteger(0);
        api.callAPIWithRetry().withLogStrategy(APIMethodPoller.LogStrategy.ALL).peek(rs -> counter.getAndIncrement())
                .until(rs -> counter.get() == 5).pollEvery(1, ChronoUnit.SECONDS).stopAfter(8, ChronoUnit.SECONDS)
                .execute();
        api.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "Api test")
    public void testGetTodo() {
        GetTodoMethods getTodoMethods = new GetTodoMethods();
        getTodoMethods.callAPIExpectSuccess();
        getTodoMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getTodoMethods.validateResponseAgainstSchema("api/todos/_get/rs.schema");
    }
}
