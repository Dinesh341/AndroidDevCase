package com.my.klm

import com.my.klm.model.token.TokenData
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.my.klm.utils.PrefUtils
import com.my.klm.destinationdetails.DestinationDetail
import com.my.klm.destinationroute.DestinationRouteActivity
import com.my.klm.flightroute.FlightRouteActivity
import com.my.klm.viewmodels.FlightViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val viewModel by lazy{
        ViewModelProviders.of(this@MainActivity).get(FlightViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.app_name)
        flight_status.setOnClickListener {
            intent = Intent(this, FlightStatusActivity::class.java)
            startActivity(intent)
        }
        flight_route.setOnClickListener {
            intent = Intent(this, FlightRouteActivity::class.java)
            startActivity(intent)
        }
        destination_suggestion.setOnClickListener {
            intent = Intent(this, DestinationRouteActivity::class.java)
            startActivity(intent)
        }
        wether_information.setOnClickListener {
            intent = Intent(this, DestinationDetail::class.java)
            startActivity(intent)
        }
        viewModel.getToken()
    }

}
