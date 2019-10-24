:- dynamic
	res/2,
	opc/2.

opciones(X,Y):-
	asserta(opc(X,Y)).

perfil:-
	administracion;
    	derecho;
	educacion.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% REGLAS %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% opc(atencion,si) 			opc(atencion,no)
% opc(hab_numerica,si) 		opc(hab_numerica,no) %%%%Se refiere a Estadistica, Economía, etc
% opc(razonamiento,si) 		opc(razonamiento,no)
% opc(vocabulario,si) 		opc(vocabulario,no)
% opc(domhabla,si) 			opc(domhabla,no)
% opc(espacial,si) 			opc(espacial,no)
% opc(trabajo_equipo,si) 	opc(trabajo_equipo,no)
% opc(idiomas,si) 			opc(idiomas,no)
% opc(informatica,si) 		opc(informatica,no)
% opc(potempresarial,si) 	opc(potempresarial,no)
% opc(commprension,si) 		opc(commprension,no)
% opc(matematica,si) 		opc(matematica,no)
% opc(filosofia,si) 		opc(filosofia,no)

administracion:-
	opc(atencion,si),
	opc(hab_numerica,si),
	opc(razonamiento,no),
	opc(vocabulario,si),
	opc(domhabla,si),
	opc(espacial,no),
	opc(informatica,si),
	opc(idiomas,si),
	opc(trabajo_equipo,no),
	opc(potempresarial,si),
	opc(commprension,si),
	opc(matematica,no),
	opc(filosofia,no),
	opc(plan,no),
	asserta(res(administracion,si)).

edsecundaria:-
	opc(atencion,si),
	opc(hab_numerica,si);
	opc(hab_numerica,no),
	opc(razonamiento,si);
	opc(razonamiento,no),
	opc(vocabulario,si),
	opc(domhabla,si);
	opc(espacial,si),
	opc(trabajo_equipo,si);
	opc(idioma,si);
	opc(informatica,si);
	opc(informatica,no),
	opc(potempresarial,si);
	opc(potempresarial,no),
	opc(commprension,si),
	opc(matematica,si);
	opc(matematica,no),
	opc(filosofia,si),
	opc(plan,no),
	asserta(res(edsecundaria,si)).

derecho:-
	opc(atencion,si),
	opc(hab_numerica,no),
	opc(razonamiento,si),
	opc(vocabulario,si),
	opc(domhabla,si),
	opc(espacial,no),
	opc(informatica,no),
	opc(idiomas,no),
	opc(potempresarial,no),
	opc(commprension,si),
	opc(matematica,no),
	opc(filosofia,si),
	opc(plan,si),
	asserta(res(derecho,si)).

