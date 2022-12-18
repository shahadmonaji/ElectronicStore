
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.shahad.electronicstore.Modul.Item
import com.shahad.electronicstore.R

// TODO [1] Implement Adapter Class
class ItemAdapter(private val context: Context,
                  private val dataset : List<Item>)
    : RecyclerView.Adapter<ItemAdapter.ViewHolder>() { // End of BookAdapter
//

    // TODO [3] Implement Adapter override methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.items, parent, false)
        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {



        val item = dataset[position]

        holder.ItemTitle.text = context.resources.getString(item.ItemTitle)
        holder.ItemImage.setImageResource(item.ItemImage)
        holder.ItemPrice.text= context.resources.getString(item.itemPrice)

        holder.cardmassage.setOnClickListener {
           Toast.makeText(context,"Added to the card successfully!!", Toast.LENGTH_SHORT).show()
       }
        holder.clicker.setOnClickListener {
          //val intent= Intent(this,)
           // Toast.makeText(context,"see?!", Toast.LENGTH_SHORT).show()
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataset.size

    // TODO [2] Implement ViewHolder Class
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        // views in layout file
        val cardmassage: TextView=view.findViewById<Button>(R.id.addButton)
            val clicker:TextView=view.findViewById<Button>(R.id.button)
            val ItemTitle : TextView = view.findViewById(R.id.item_title)
            val ItemImage : ImageView = view.findViewById(R.id.item_img)
            val ItemPrice : TextView= view.findViewById(R.id.item_price)

    } // End ViewHolder

} // End BookAdapter