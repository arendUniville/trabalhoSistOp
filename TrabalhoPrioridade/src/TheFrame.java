public class TheFrame {
    
    int idFrame;
    int quantReferencias;
    int ultimaReferencia;
    boolean br;
    boolean bm;


    public TheFrame(int id, int quantRef, int lastRef, boolean br, boolean bm){

        this.setIdFrame(id);
        this.setQuantReferencias(quantRef);
        this.setUltimaReferencia(lastRef);
        this.setBr(br);
        this.setBm(bm);

    }


    


    public int getIdFrame() {
        return idFrame;
    }


    public void setIdFrame(int idFrame) {
        this.idFrame = idFrame;
    }


    public int getQuantReferencias() {
        return quantReferencias;
    }


    public void setQuantReferencias(int quantReferencias) {
        this.quantReferencias = quantReferencias;
    }


    public int getUltimaReferencia() {
        return ultimaReferencia;
    }


    public void setUltimaReferencia(int ultimaReferencia) {
        this.ultimaReferencia = ultimaReferencia;
    }


    public boolean isBr() {
        return br;
    }


    public void setBr(boolean br) {
        this.br = br;
    }


    public boolean isBm() {
        return bm;
    }


    public void setBm(boolean bm) {
        this.bm = bm;
    }


    
    

}
