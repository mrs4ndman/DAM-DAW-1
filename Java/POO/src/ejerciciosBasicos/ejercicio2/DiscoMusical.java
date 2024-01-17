package ejerciciosBasicos.ejercicio2;

public class DiscoMusical {
    private String titulo;

    private String autor;
    private int edition_year;
    private String formato;
    private boolean digital;

    public DiscoMusical(String titulo, String autor, int ed_year, String formato,
                        boolean digital) {
        this.titulo = titulo;
        this.autor = autor;
        this.edition_year = ed_year;
        this.formato = formato;
        this.digital = digital;
    }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setEdition_year(int ed_year) { this.edition_year = ed_year; }
    public void setFormato(String formato) { this.formato = formato; }
    public void setDigital(boolean digital) { this.digital = digital; }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getEdition_year() { return edition_year; }
    public String getFormato() { return formato; }
    public boolean getDigital() { return digital; }
}
