package SingletonPrototypePrac.service;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {
    public String getMessage() {
        return "Singleton instance hash: " + System.identityHashCode(this);
    }
}