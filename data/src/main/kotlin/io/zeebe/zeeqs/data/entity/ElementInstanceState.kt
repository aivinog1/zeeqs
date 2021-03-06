package io.zeebe.zeeqs.data.entity

enum class ElementInstanceState {
    ACTIVATING,
    ACTIVATED,

    COMPLETING,
    COMPLETED,

    TERMINATING,
    TERMINATED,

    EVENT_OCCURRED,
    TAKEN
}