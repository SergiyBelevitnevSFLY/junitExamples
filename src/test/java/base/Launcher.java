package base;

import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.LauncherSession;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import tests.TestClass;

import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

public class Launcher {

    public void smthn() {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(
                        selectClass(TestClass.class)
                )
                .filters(
                        includeClassNamePatterns(".*Tests")
                )
                .build();

        try (LauncherSession session = LauncherFactory.openSession()) {
            TestPlan testPlan = session.getLauncher().discover(request);

            // ... discover additional test plans or execute tests
        } catch (Exception e) {


        }
    }
}
