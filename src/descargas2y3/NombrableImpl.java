package descargas2y3;

public abstract class NombrableImpl implements Nombrable {
	
	 	protected String nombre;

		public NombrableImpl(String nombre) {
			super();
			this.nombre = nombre;
		
		}
	 		 	
	 	public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getId() {
			return nombre;
		}
}