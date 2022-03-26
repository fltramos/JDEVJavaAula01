package arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("93458940715");
		usuario1.setLogin("francisco");
		usuario1.setSenha("299803");
		usuario1.setNome("Francisco Ramos");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("93458940722");
		usuario2.setLogin("andre");
		usuario2.setSenha("308992");
		usuario2.setNome("Andre Silva");
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();		
				
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\Francisco\\git\\JDEVJavaAula01\\primeiro-programa-java\\src\\arquivos\\filjson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		//Lendo o arquivo Json
		
		FileReader fileReader = new FileReader("C:\\Users\\Francisco\\git\\JDEVJavaAula01\\primeiro-programa-java\\src\\arquivos\\filjson.json");
		
		JsonArray jsonArray =  (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> listUsuarios = new ArrayList<>();
		
		for(JsonElement jsonElement : jsonArray) {
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuarios.add(usuario);
		}
		System.out.println("Leitura do arquivo JSON: " + listUsuarios);

	}

}
