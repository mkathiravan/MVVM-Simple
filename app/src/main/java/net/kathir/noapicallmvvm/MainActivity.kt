package net.kathir.noapicallmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import net.kathir.noapicallmvvm.model.User
import net.kathir.noapicallmvvm.viewModel.UserViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewmodel = ViewModelProviders.of(this)[UserViewModel::class.java]

        val userObserver = Observer<User>
        {
            user ->
            val textViewEmail : TextView = this.findViewById(R.id.txtViewEmail)
            var textViewPassword : TextView = this.findViewById(R.id.txtViewPassword)

            textViewEmail.text = user.email
            textViewPassword.text = user.password
        }

        viewmodel.getUserData().observe(this,userObserver)

    }
}
