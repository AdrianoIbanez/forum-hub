package br.alura.curso.forumhub.forum_hub.dtos;

public enum Curso {
    JAVA,
    HTML,
    CSS,
    JAVASCRIPT,
    REACT,
    NODE,
    PYTHON;
}
 /*   private String cursoOmdb;

    Curso(String curso) {
        this.cursoOmdb = curso;
    }

    public static Curso fromString(String text) {
        for(Curso curso: Curso.values()) {
            if (curso.cursoOmdb.equalsIgnoreCase(text)) {
                return curso;
            }
        }
        throw new IllegalArgumentException("Curso inválido");
    }


}*/
