package com.eopeter.fluttermapboxnavigation.models

import com.google.gson.annotations.SerializedName
import com.mapbox.geojson.Point
import java.io.Serializable

/**
 * A simple class to capture how most people will express a waypoint.
 */
data class Waypoint(
    @SerializedName("name")
    val name: String = "Próxima Entrega", // Valor por defecto
    @SerializedName("point")
    val point: Point,
    @SerializedName("isSilent")
    val isSilent: Boolean,
) : Serializable {
    constructor(name: String, longitude: Double, latitude: Double, isSilent: Boolean) : this(
        name,
        Point.fromLngLat(longitude, latitude),
        isSilent
    )
    constructor(name: String, point: Point) : this(name, point, false)
    constructor(longitude: Double, latitude: Double) : this(
        "Próxima Entrega", // Valor por defecto si no se proporciona un nombre
        Point.fromLngLat(longitude, latitude),
        false
    )
    constructor(point: Point, isSilent: Boolean) : this("Próxima Entrega", point, isSilent)
    constructor(point: Point) : this("Próxima Entrega", point, true)
}
