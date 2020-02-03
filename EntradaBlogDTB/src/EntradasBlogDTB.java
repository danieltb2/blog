
public class EntradasBlogDTB {
	/*Clase para manejar las entradas de un blog.
	 * La clase se creó el 3/2/2020 por Daniel Terol Barbero.
	 * Esta es la versión 2.3
	 */
		
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		/**
		 * Constructor de la clase EntradasBlogDTB
		 * @param id id que identifica a la persona.
		 * @param autor nombre de la persona.
		 * @param texto el mensaje que escribe la persona.
		 * @throws IllegalArgumentException.
		 */
		public EntradasBlogDTB(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		
		/**
		 * Metodo que añade el autor a un string.
		 */
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/**
		 * Método que devuelve la id.
		 * @return la id.
		 */
		public int getId(){
			return this.id;
		}
		
		/**
		 * Método que devuelve el texto.
		 * @return el texto.
		 */
		public String getTexto(){
			return this.texto;
		}
		
		/**
		 * Método que devuelve el autor en mayusclas.
		 * @return el autor en mayusculas.
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/**
		 * Método que devuelve el autor.
		 * @returnautor que devuelve.
		 */
		public String devuelveAutor(){
			return this.autor;
		}
		
		public static void main(String[] args) {
			EntradasBlogDTB e1=new EntradasBlogDTB (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
		}
	
}
