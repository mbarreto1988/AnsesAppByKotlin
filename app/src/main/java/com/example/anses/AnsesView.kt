package com.example.anses

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.anses.ui.theme.AnsesTheme

@Composable
fun AnsesView(modifier: Modifier = Modifier) {
    Column ( modifier = modifier.fillMaxSize().padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally ){

        Text("Hola Matias", style = MaterialTheme.typography.titleLarge)

        Row( modifier=Modifier.padding(vertical = 10.dp )) {
            Text( "Ingresa a tu cuenta" )
            Spacer(modifier = modifier.weight(1f))
            Text( "Cambiar usuario" )
        }

        TextField( modifier = modifier.fillMaxWidth(), value = "Clave de seguridad social", onValueChange = {} )

        Button( modifier = modifier.padding(10.dp), onClick = {} ) {
            Text("Ingresar")
        }

        Spacer( modifier = modifier.height(40.dp) )

        Text("Olvide mi clave" )

        Row {
            Text( "A" )
            Text( "B" )
            Text( "C" )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AnsesPreview() {
    AnsesTheme {
        AnsesView()
    }
}