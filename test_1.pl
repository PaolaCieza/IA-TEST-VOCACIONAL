:- dynamic
	res/2,
	opc/2.

opciones(X,Y):-
	asserta(opc(X,Y)).

perfil:-
	administracion;
    	derecho;
	educacion.

administracion:-
	opc(commprension,no),	
	opc(hab_numerica,si),
	opc(matematica.si),
	opc(atencion,no),
	opc(domhabla,si),
	opc(potempresarial,si),
	opc(espacial,no),
	opc(idiomas,si),
	opc(informatica,si),
	opc(razonamiento,no),
	opc(trabajo_equipo,si),
	opc(vocabulario,no),
	asserta(res(administracion,si)).

derecho:-
	opc(commprension,si),	
	opc(hab_numerica,si),
	opc(matematica.si),
	opc(atencion,si),
	opc(domhabla,si),
	opc(potempresarial,si),
	opc(espacial,si),
	opc(idiomas,si),
	opc(informatica,si),
	opc(razonamiento,si),
	opc(trabajo_equipo,si),
	opc(vocabulario,si),
	asserta(res(derecho,si)).

educacion:-
	opc(commprension,si),	
	opc(hab_numerica,si),
	opc(matematica.si),
	opc(atencion,si),
	opc(domhabla,si),
	opc(potempresarial,si),
	opc(espacial,si),
	opc(idiomas,si),
	opc(informatica,si),
	opc(razonamiento,si),
	opc(trabajo_equipo,si),
	opc(vocabulario,si),
	asserta(res(educacion,si)).

