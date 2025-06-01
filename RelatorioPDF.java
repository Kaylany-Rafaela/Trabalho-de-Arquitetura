////Para a CCH1  Classe principal que representa o produto final: um relatório em PDF
//public class RelatorioPDF {
//    // Atributos do relatório
//    private String titulo;
//    private String autor;
//    private String conteudo;
//    private String rodape;
//    // Construtor privado: impede que o objeto seja instanciado diretamente
//    // Força o uso do Builder para criar objetos dessa classe
//    private RelatorioPDF(Builder builder) {
//        this.titulo = builder.titulo;
//        this.autor = builder.autor;
//        this.conteudo = builder.conteudo;
//        this.rodape = builder.rodape;
//    }
//    // Método que gera a saída formatada do relatório
//    public String gerar() {
//        StringBuilder sb = new StringBuilder();
//        if (titulo != null) sb.append("=== ").append(titulo).append(" ===\n");
//        if (autor != null) sb.append("Autor: ").append(autor).append("\n");
//        if (conteudo != null) sb.append("\n").append(conteudo).append("\n");
//        if (rodape != null) sb.append("\n---\n").append(rodape).append("\n");
//        return sb.toString();
//    }
//    // Classe interna estática que implementa o padrão Builder
//    public static class Builder {
//        // Atributos duplicados: armazenam valores que serão passados ao RelatorioPDF
//        private String titulo;
//        private String autor;
//        private String conteudo;
//        private String rodape;
//        // Cada método 'comX' representa uma etapa opcional da construção
//        // Retorna o próprio builder para permitir encadeamento (API fluente)
//        public Builder comTitulo(String titulo) {
//            this.titulo = titulo;
//            return this;
//        }
//        public Builder comAutor(String autor) {
//            this.autor = autor;
//            return this;
//        }
//        public Builder comConteudo(String conteudo) {
//            this.conteudo = conteudo;
//            return this;
//        }
//        public Builder comRodape(String rodape) {
//            this.rodape = rodape;
//            return this;
//        }
//        // Método que finaliza a construção e retorna o objeto pronto
//        public RelatorioPDF build() {
//            return new RelatorioPDF(this);
//        }
//    }
//    // Método main para testar a construção do relatório
//    public static void main(String[] args) {
//        // Criação de um relatório com todas as seções, usando o builder
//        RelatorioPDF relatorio = new RelatorioPDF.Builder()
//                .comTitulo("Relatório de Vendas - Maio")
//                .comAutor("ALICE TESTE")
//                .comConteudo("As vendas do mês de maio cresceram 18% em relação a abril.")
//                .comRodape("Confidencial - Uso interno")
//                .build(); // chamada final para gerar o objeto
//        // Impressão do relatório no console
//        System.out.println(relatorio.gerar());
//    }
//}
