package SingletonPrototypePrac.controller;

import SingletonPrototypePrac.service.PrototypeService;
import SingletonPrototypePrac.service.SingletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {

    private final ApplicationContext context;

    @Autowired
    public ServiceController(ApplicationContext context) {
        this.context = context;
    }

    @GetMapping("/")
    public String getServiceHashes(Model model) {
        SingletonService singletonService = context.getBean(SingletonService.class);
        PrototypeService prototypeService = context.getBean(PrototypeService.class);
        model.addAttribute("singletonHash", singletonService.getMessage());
        model.addAttribute("prototypeHash", prototypeService.getMessage());
        return "hashes";
    }
}