package com.safframework.statemachine.state

import com.safframework.statemachine.StateAction
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

/**
 *
 * @FileName:
 *          com.safframework.statemachine.state.StateExit
 * @author: Tony Shen
 * @date: 2020-02-26 23:57
 * @version: V1.0 <描述当前版本功能>
 */
class StateExit {

    private val actions = mutableListOf<StateAction>()

    /**
     * 添加一个 action，在状态转换时执行(时间点是在状态转换之前)
     */
    private fun action(action: () -> StateAction){
        actions.add(action.invoke())
    }

    fun stateAction(context: CoroutineContext = EmptyCoroutineContext, action: (State, CoroutineScope) -> Unit){
        action{
            StateAction(context, action)
        }
    }

    fun getActions() = actions
}
