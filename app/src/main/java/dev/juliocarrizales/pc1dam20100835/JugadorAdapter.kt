package dev.juliocarrizales.pc1dam20100835

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class JugadorAdapter(private val jugadores: List<Jugador>) :
    RecyclerView.Adapter<JugadorAdapter.JugadorViewHolder>() {

    inner class JugadorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imgJugador: ImageView = itemView.findViewById(R.id.imgJugador)
        private val txtNombre: TextView = itemView.findViewById(R.id.txtNombre)
        private val txtAnoNacimiento: TextView = itemView.findViewById(R.id.txtAnoNacimiento)
        private val txtEdad: TextView = itemView.findViewById(R.id.txtEdad)

        fun bind(jugador: Jugador) {
            imgJugador.setImageResource(jugador.fotoResId) // Cargar imagen desde drawable
            txtNombre.text = jugador.nombreCompleto
            txtAnoNacimiento.text = "Año de nacimiento: ${jugador.añoNacimiento}"
            txtEdad.text = "Edad: ${jugador.edad}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JugadorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_jugador, parent, false)
        return JugadorViewHolder(view)
    }

    override fun onBindViewHolder(holder: JugadorViewHolder, position: Int) {
        holder.bind(jugadores[position])
    }

    override fun getItemCount(): Int {
        return jugadores.size
    }
}

