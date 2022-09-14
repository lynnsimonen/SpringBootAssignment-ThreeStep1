package edu.wctc.springbootassignmentthreestep1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoyController {

    @GetMapping("/step-one")
    public String getEthanPage() {
        return "steps/ethan";
    }

    @GetMapping("/step-two")
    public String getLucasPage() {
        return "steps/lucas";
    }

    @GetMapping("/step-three")
    public String getwyliePage() {
        return "steps/wylie";
    }
}



