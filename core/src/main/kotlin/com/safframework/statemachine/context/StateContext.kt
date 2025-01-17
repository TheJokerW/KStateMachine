package com.safframework.statemachine.context

import com.safframework.statemachine.model.BaseEvent
import com.safframework.statemachine.model.BaseState
import com.safframework.statemachine.transition.Transition
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext

/**
 * 状态上下文
 * @FileName:
 *          com.safframework.statemachine.context.StateContext
 * @author: Tony Shen
 * @date: 2020-02-19 21:19
 * @version: V1.0 <描述当前版本功能>
 */
interface StateContext {

    fun getEvent(): BaseEvent

    fun getSource(): BaseState

    fun getTarget(): BaseState

    fun getException(): Exception?

    fun setException(exception: Exception)

    fun getTransition(): Transition

    fun getCoroutineScope(): CoroutineScope

}
