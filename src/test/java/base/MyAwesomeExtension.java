package base;

import org.junit.jupiter.api.extension.*;
import org.junit.platform.launcher.LauncherSessionListener;

import java.util.List;

public class MyAwesomeExtension implements BeforeAllCallback, AfterAllCallback,
        BeforeEachCallback, AfterEachCallback, BeforeTestExecutionCallback,
        AfterTestExecutionCallback, LauncherSessionListener {
    public static List<String> testClasses;
    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {

        long d = Thread.currentThread().getId();

        ExtensionContext extensionContext1 = extensionContext;

        System.out.println("Listener tread id  in after all is " + d);
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        long d = Thread.currentThread().getId();
        ExtensionContext extensionContext1 = extensionContext;
        System.out.println("Listener tread id  in after each is " + d);
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        long d = Thread.currentThread().getId();
        System.out.println("Listener tread id  in after test execution is " + d);

//       String x = Optional.ofNullable(Throwables.getStackTraceAsString(extensionContext.getExecutionException().get())).orElse("Passed");
//        Throwables.getStackTraceAsString(((MethodExtensionContext) extensionContext).throwableCollector.getThrowable())
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        long d = Thread.currentThread().getId();
        System.out.println("Listener tread id  in before all execution is " + d);
        extensionContext.getUniqueId();
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        long d = Thread.currentThread().getId();
        System.out.println("Listener tread id  in before each is " + d);
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        long d = Thread.currentThread().getId();
        System.out.println("Listener tread id  in before test execution is " + d);
    }

}
