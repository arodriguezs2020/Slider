package es.alvarorodriguez.slider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.OnItemClickListener

class MainActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://www.km77.com/media/fotos/ford_ka_2003_1272_1.jpg", "Ford ka 2003"))
        list.add(CarouselItem("https://www.jorgeferro.com/wp-content/uploads/2020/01/Volkswagen-Suran-Highline-iMotion-2013-Frente-Izquierdo.jpeg", "Suran 2013"))
        list.add(CarouselItem("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/2017_Toyota_GT86_PRO_D-4S_2.0_%281%29.jpg/1200px-2017_Toyota_GT86_PRO_D-4S_2.0_%281%29.jpg", "Toyota 86"))

        carousel.onItemClickListener = object : OnItemClickListener {
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                Toast.makeText(this@MainActivity, "Auto: ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
            }

            override fun onLongClick(position: Int, dataObject: CarouselItem) {
                TODO("Not yet implemented")
            }
        }

        carousel.addData(list)
    }
}