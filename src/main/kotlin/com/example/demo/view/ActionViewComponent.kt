package com.example.demo.view

import de.tschuehly.spring.viewcomponent.core.IViewContext
import de.tschuehly.spring.viewcomponent.core.action.GetViewAction
import de.tschuehly.spring.viewcomponent.core.component.ViewComponent
import de.tschuehly.spring.viewcomponent.thymeleaf.ViewContext

@ViewComponent
class ActionViewComponent {
    data class ActionView(val counter: Int) : ViewContext

    fun render() = ActionView(counter)

    var counter: Int = 0

    @GetViewAction("/customPath/countUp")
    fun countUp(): IViewContext {
        counter += 1
        return render()
    }
}
