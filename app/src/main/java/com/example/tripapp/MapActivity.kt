package com.example.tripapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tripapp.databinding.ActivityMapviewBinding
import com.naver.maps.geometry.LatLng
import com.naver.maps.map.*

class MapActivity : AppCompatActivity(), OnMapReadyCallback {
    companion object{
        lateinit var naverMap: NaverMap
    }

    private lateinit var mapView: MapView
    private lateinit var binding: ActivityMapviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapviewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mapView = binding.mapView
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)

    }
    override fun onMapReady(naverMap: NaverMap) {
        MapActivity.naverMap = naverMap

        var camPos = CameraPosition(
            LatLng(34.38, 128.55),
            9.0
        )
        naverMap.cameraPosition = camPos
    }
}