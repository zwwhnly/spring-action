package chapter03.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("singleton")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DemoSingletonService {
}
