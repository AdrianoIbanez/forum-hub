id bigint not null auto_increment,
usuario_id bigint not null,
topico_id bigint not null,
data datetime not null,

primary key(id),
constaint fk_respostas_usuario_id foreign key(usuario_id) references usuarios(id),
constaint fk_respostas_topico_id foreign key(topico_id) references topicos(id)