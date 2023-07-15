public enum Tipo {

	////////////////////////////////////////////////////
    /// UTILIZZARE LA FUNZIONE DI REFACTOR DI ECLIPSE///
    /// PER MODIFICARE IL NOME DI FUNZIONI, CONDITION///
    ///             ED ENTITà                        ///   
    ////////////////////////////////////////////////////
	
    TIPO1(""), TIPO2(""), TIPO3(""), TIPO4("");
	
	private Tipo(String value) {
		this.value = value;
	}

	private String value;
	
	public String toString() {
		return this.value;
	}
}
