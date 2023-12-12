import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.ItemsViewModel
import com.example.recyclerview.R

// Класс адаптера, который принимает список ItemsViewModel
class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // Создание новых представлений
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Надувает представление card_view_design,
        // которое используется для отображения элементов списка
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // Привязка элементов списка к представлению
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = mList[position]

        // Устанавливает изображение в ImageView из нашего класса ItemHolder
        holder.imageView.setImageResource(itemsViewModel.image)

        // Устанавливает текст в TextView из нашего класса ItemHolder
        holder.tutorial.text = itemsViewModel.tutorial

        holder.decription.text = itemsViewModel.description
    }

    // Возвращает количество элементов в списке
    override fun getItemCount(): Int {
        return mList.size
    }

    // Класс, который содержит представления для изображения и текста
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val tutorial: TextView = itemView.findViewById(R.id.tutorialTextView)
        val decription: TextView = itemView.findViewById(R.id.descriptionTextView)
    }
}
