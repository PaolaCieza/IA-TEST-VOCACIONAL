:- dynamic
	res/2,
	opc/2.

opciones(X,Y):-
	asserta(opc(X,Y)).

perfil:-
	administracion;
    derecho;
	edsecundaria;
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
	opc(atencion,no);
	opc(atencion,si),
	opc(hab_numerica,si),
	opc(razonamiento,no);
	opc(razonamiento,si),
	opc(vocabulario,no);
	opc(vocabulario,si),
	opc(domhabla,si),
	opc(espacial,no);
	opc(espacial,si),
	opc(trabajo_equipo,si),
	opc(idiomas,si),
	opc(informatica,si),
	opc(potempresarial,si),
    opc(commprension,no);
	opc(commprension,si),
	opc(matematica,si),
	opc(filosofia,si);
	opc(filosofia,no),
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
	asserta(res(edsecundaria,si)).

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

