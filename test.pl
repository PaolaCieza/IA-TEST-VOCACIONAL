:- dynamic
	res/2,
	opc/2.

opciones(X,Y):-
	asserta(opc(X,Y)).

perfil:-
	ingcivil;
	ingamb;
	ingindus;
	contabilidad;
	derecho;
	medicina.

ingcivil:-
	opc(matematico,si),
	opc(domesp,si),
	opc(domhabla,si),
	opc(vocserv,no),
	opc(relinter,si),
	opc(mansw,si),
	asserta(res(ingcivil,si)).

ingindus:-
	opc(matematico,si),
	opc(domesp,no),
	opc(domhabla,si),
	opc(vocserv,no),
	opc(relinter,si),
	opc(mansw,si),
	asserta(res(ingindus,si)).

medicina:-
	opc(matematico,si),
	opc(domesp,no),
	opc(domhabla,si),
	opc(vocserv,si),
	opc(relinter,si),
	opc(mansw,no),
	asserta(res(medicina,si)).

ingamb:-
	opc(matematico,si),
	opc(domesp,si),
	opc(domhabla,si),
	opc(vocserv,no),
	opc(relinter,si),
	opc(mansw,no),
	asserta(res(ingamb,si)).

contabilidad:-
	opc(matematico,si),
	opc(domesp,no),
	opc(domhabla,si),
	opc(vocserv,no),
	opc(relinter,si),
	opc(mansw,si),
	asserta(res(contabilidad,si)).

derecho:-
	opc(matematico,no),
	opc(domesp,si),
	opc(domhabla,si),
	opc(vocserv,si),
	opc(relinter,si),
	opc(mansw,no),
	asserta(res(derecho,si)).





