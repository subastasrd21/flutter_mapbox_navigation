package com.eopeter.fluttermapboxnavigation.models

enum class MapBoxEvents(val value: String) {
    MAP_READY("map_ready"),
    ROUTE_BUILDING("route_building"),
    ROUTE_BUILT("route_built"),
    ROUTE_BUILD_FAILED("route_build_failed"),
    ROUTE_BUILD_CANCELLED("route_build_cancelled"),
    ROUTE_BUILD_NO_ROUTES_FOUND("route_build_no_routes_found"),
    PROGRESS_CHANGE("progress_change"),
    USER_OFF_ROUTE("user_off_route"),
    MILESTONE_EVENT("milestone_event"),
    NAVIGATION_RUNNING("navigation_running"),
    NAVIGATION_CANCELLED("navigation_cancelled"),
    NAVIGATION_USER_CANCELLED("navigation_user_cancelled"),
    NAVIGATION_FINISHED("navigation_finished"),
    FASTER_ROUTE_FOUND("faster_route_found"),
    SPEECH_ANNOUNCEMENT("speech_announcement"),
    BANNER_INSTRUCTION("banner_instruction"),
    ON_ARRIVAL("on_arrival"),
    ON_WAYPOINTARRIVAL("on_waypointarrival"),
    ON_NEXTROUTELEGSTART("on_nextroutelegstart"),
    FAILED_TO_REROUTE("failed_to_reroute"),
    REROUTE_ALONG("reroute_along"),
    ON_MAP_TAP("on_map_tap")
}
