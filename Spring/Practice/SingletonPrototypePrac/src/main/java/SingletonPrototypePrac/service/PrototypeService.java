package SingletonPrototypePrac.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeService {
    public String getMessage() {
        return "Prototype instance hash: " + System.identityHashCode(this);
    }
}