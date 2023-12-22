package com.example.demo

import com.example.demo.view.ActionViewComponent
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TestController(
    private val actionViewComponent: ActionViewComponent
) {

    @GetMapping("/action")
    fun actionComponent() = actionViewComponent.render()
}
