package co.proexe

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.lifecycleScope
import co.proexe.databinding.ActivityEpgBinding
import kotlinx.coroutines.launch

class MainActivity : FragmentActivity() {

    lateinit var binding: ActivityEpgBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView<ActivityEpgBinding>(
            this, R.layout.activity_epg
        )
/*
        val repositoryImpl=RepositoryImpl()
        lifecycleScope.launch {
            Toast.makeText(this@MainActivity,repositoryImpl.getPrograms().toString(), Toast.LENGTH_LONG).show()

        }*/
    }
}