package net.kathir.noapicallmvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.kathir.noapicallmvvm.model.User

class UserViewModel() : ViewModel()
{
    private var userData: MutableLiveData<User> = MutableLiveData()

    init {
        populateData()
    }

    fun getUserData():MutableLiveData<User>
    {
        return this.userData
    }

    private fun populateData() {

        val user = User()
        user.email = "kathiravan@gmail.com"
        user.password ="6655523444"
        this.userData.value = user

    }
}