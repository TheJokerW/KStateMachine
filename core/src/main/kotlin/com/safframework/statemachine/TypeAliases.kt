package com.safframework.statemachine

import com.safframework.statemachine.state.State
import com.safframework.statemachine.transition.Transition
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

/**
 *
 * @FileName:
 *          com.safframework.statemachine.TypeAliases
 * @author: Tony Shen
 * @date: 2020-02-19 23:54
 * @version: V1.0 <描述当前版本功能>
 */

typealias Guard = () -> Boolean

class TransitionAction(val coroutineContext:CoroutineContext = EmptyCoroutineContext, val action:suspend (Transition, CoroutineScope) -> Unit)
class StateAction(val coroutineContext:CoroutineContext = EmptyCoroutineContext, val action:suspend (State, CoroutineScope) -> Unit)

