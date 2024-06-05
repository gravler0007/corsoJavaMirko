public abstract class DispositivoDiBase implements DispositivoElettronico {
    
    protected String nome;
    protected String password;

    
    public DispositivoDiBase(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }


    //metodo astratto che le classi figlie dovranno specializzare
    public abstract void avviaApplicazione(String nomeApp);
}
