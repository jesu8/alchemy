package com.jesu.alchemy.data;


import com.jesu.alchemy.model.Ingrediente;
import com.jesu.alchemy.model.Receta;

import java.util.List;

public class RecetasData {

    public static final List<Receta> TODAS = List.of(

            new Receta("Cortavelas", "Espadas y Dagas", List.of(
                    new Ingrediente("Daga de sílex", 1),
                    new Ingrediente("Prisma de fuego", 1)
            )),

            new Receta("Daga de obsidiana", "Espadas y Dagas", List.of(
                    new Ingrediente("Daga de sílex", 1),
                    new Ingrediente("Trozo de obsidiana", 1)
            )),

            new Receta("Daga divina", "Espadas y Dagas", List.of(
                    new Ingrediente("Hoz", 1),
                    new Ingrediente("Fragmento de acero puro", 1),
                    new Ingrediente("Botella de aguafresca", 1)
            )),

            new Receta("Espada de paladín", "Espadas y Dagas", List.of(
                    new Ingrediente("Espada de soldado", 1),
                    new Ingrediente("Ferrodiamantes", 2),
                    new Ingrediente("Fragmento de acero puro", 2)
            )),

            new Receta("Espada meteoro", "Espadas y Dagas", List.of(
                    new Ingrediente("Espada sagrada", 1),
                    new Ingrediente("Estraperla", 2),
                    new Ingrediente("Fragmento de meteorito", 3)
            )),

            new Receta("Espada perdida", "Espadas y Dagas", List.of(
                    new Ingrediente("Bigolito", 1),
                    new Ingrediente("Campana grave", 2),
                    new Ingrediente("Nomeolvides", 3)
            )),

            new Receta("Espada primigenia", "Espadas y Dagas", List.of(
                    new Ingrediente("Espada meteoro", 1),
                    new Ingrediente("Caleidas", 5),
                    new Ingrediente("Roca con lágrimas de troll", 5)
            )),

            new Receta("Espada sagrada", "Espadas y Dagas", List.of(
                    new Ingrediente("Espada magna", 1),
                    new Ingrediente("Fragmento de meteorito", 2),
                    new Ingrediente("Piedra del ímpetu", 3)
            )),

            new Receta("Estela sónica", "Espadas y Dagas", List.of(
                    new Ingrediente("Carámbano", 1),
                    new Ingrediente("Fragmento de meteorito", 2),
                    new Ingrediente("Pluma afilada", 2)
            )),

            new Receta("Quebrantaplanetas", "Espadas y Dagas", List.of(
                    new Ingrediente("Estela sónica", 1),
                    new Ingrediente("Lúminas", 5),
                    new Ingrediente("Ojo del mal", 5)
            )),

            new Receta("Hacha de relojero", "Hachas y Martillos", List.of(
                    new Ingrediente("Hacha de hierro", 1),
                    new Ingrediente("Engranaje", 1)
            )),

            new Receta("Hacha infernal", "Hachas y Martillos", List.of(
                    new Ingrediente("Gran hacha", 1),
                    new Ingrediente("Par de alas negras", 2),
                    new Ingrediente("Bigolito", 3)
            )),

            new Receta("Hacha mecánica", "Hachas y Martillos", List.of(
                    new Ingrediente("Hacha de relojero", 1),
                    new Ingrediente("Broquillo", 1),
                    new Ingrediente("Engranaje", 1)
            )),

            new Receta("Hacha titánica", "Hachas y Martillos", List.of(
                    new Ingrediente("Hacha infernal", 1),
                    new Ingrediente("Caleidas", 5),
                    new Ingrediente("Papiro de la verdad", 5)
            )),

            new Receta("Martillo defensor", "Hachas y Martillos", List.of(
                    new Ingrediente("Tumbatorres", 1),
                    new Ingrediente("Ferrodiamantes", 2),
                    new Ingrediente("Campana grave", 2)
            )),

            new Receta("Martillo de payaso", "Hachas y Martillos", List.of(
                    new Ingrediente("Pompipa", 2),
                    new Ingrediente("Barba de gnomo", 3),
                    new Ingrediente("Trozo de piel suave", 3)
            )),

            new Receta("Mazo meteórico", "Hachas y Martillos", List.of(
                    new Ingrediente("Martillo de payaso", 1),
                    new Ingrediente("Pipa de la paz", 2),
                    new Ingrediente("Fragmento de meteorito", 3)
            )),

            new Receta("Garras astrófagas", "Garras", List.of(
                    new Ingrediente("Garras de témpanos", 1),
                    new Ingrediente("Caleidas", 5),
                    new Ingrediente("Par de alas de ángel", 5)
            )),

            new Receta("Garras crisol", "Garras", List.of(
                    new Ingrediente("Garras de acero", 1),
                    new Ingrediente("Piedra gélida", 2),
                    new Ingrediente("Fragmento de acero puro", 2)
            )),

            new Receta("Garras de acero", "Garras", List.of(
                    new Ingrediente("Garras taurinas", 1),
                    new Ingrediente("Cuenta de jade", 2),
                    new Ingrediente("Engranaje", 2)
            )),

            new Receta("Garras de glaciela", "Garras", List.of(
                    new Ingrediente("Zarpas glaciales", 1),
                    new Ingrediente("Piedra gélida", 2),
                    new Ingrediente("Glaciolo", 3)
            )),

            new Receta("Garras de hueso", "Garras", List.of(
                    new Ingrediente("Garras bestiales", 1),
                    new Ingrediente("Hueso duro de roer", 1)
            )),

            new Receta("Garras de los vientos", "Garras", List.of(
                    new Ingrediente("Garras silvanas", 1),
                    new Ingrediente("Trozo de madera azul", 2),
                    new Ingrediente("Manojo de hierba del despertar", 2)
            )),

            new Receta("Garras de témpanos", "Garras", List.of(
                    new Ingrediente("Garras de glaciela", 1),
                    new Ingrediente("Piedra del ímpetu", 2),
                    new Ingrediente("Cuenta de jade", 3)
            )),

            new Receta("Garras perversas", "Garras", List.of(
                    new Ingrediente("Garras poseídas", 1),
                    new Ingrediente("Trozo de madera azul", 2),
                    new Ingrediente("Flor ponzoña", 3)
            )),

            new Receta("Lanza arcoíris", "Lanzas", List.of(
                    new Ingrediente("Bigolito", 1),
                    new Ingrediente("Cuenta de jade", 2),
                    new Ingrediente("Prisma de fuego", 3)
            )),

            new Receta("Lanza del gigante", "Lanzas", List.of(
                    new Ingrediente("Lanza arcoíris", 1),
                    new Ingrediente("Piedra ritual", 2),
                    new Ingrediente("Semilla de discordia", 3)
            )),

            new Receta("Lanza de paladín", "Lanzas", List.of(
                    new Ingrediente("Lanza de soldado", 1),
                    new Ingrediente("Ferrodiamantes", 2),
                    new Ingrediente("Campana grave", 2)
            )),

            new Receta("Lanza regia", "Lanzas", List.of(
                    new Ingrediente("Cuenta de jade", 2),
                    new Ingrediente("Fragmento de acero puro", 2),
                    new Ingrediente("Trozo de obsidiana", 2)
            )),

            new Receta("Sieteleguas", "Lanzas", List.of(
                    new Ingrediente("Lanza del gigante", 1),
                    new Ingrediente("Roca con lágrimas de troll", 5),
                    new Ingrediente("Ojo del mal", 5)
            )),

            new Receta("Armadura defensora", "Armaduras", List.of(
                    new Ingrediente("Armadura arcana", 1),
                    new Ingrediente("Pipa de la paz", 2),
                    new Ingrediente("Piedra del ímpetu", 3)
            )),

            new Receta("Armadura de paladín", "Armaduras", List.of(
                    new Ingrediente("Coraza ferroporcina", 1),
                    new Ingrediente("Ferrodiamantes", 2),
                    new Ingrediente("Fragmento de acero puro", 2)
            )),

            new Receta("Armadura reforzada", "Armaduras", List.of(
                    new Ingrediente("Armadura robusta", 1),
                    new Ingrediente("Trozo de piel suave", 1)
            )),

            new Receta("Armadura regia", "Armaduras", List.of(
                    new Ingrediente("Armadura de escamas", 1),
                    new Ingrediente("Piedra gélida", 2),
                    new Ingrediente("Broquillos", 2)
            )),

            new Receta("Armadura reluciente", "Armaduras", List.of(
                    new Ingrediente("Armadura de paladín", 1),
                    new Ingrediente("Medalla de inmunidad", 1),
                    new Ingrediente("Pipa de la paz", 3)
            )),

            new Receta("Armadura titánica", "Armaduras", List.of(
                    new Ingrediente("Armadura reluciente", 1),
                    new Ingrediente("Roca con lágrimas de troll", 5),
                    new Ingrediente("Papiro de la verdad", 5)
            )),

            new Receta("Armadura vendaval", "Armaduras", List.of(
                    new Ingrediente("Toga cortaviento", 1),
                    new Ingrediente("Pluma afilada", 1),
                    new Ingrediente("Semilla sonajero", 2)
            )),

            new Receta("Coraza de hueso", "Armaduras", List.of(
                    new Ingrediente("Campana grave", 1),
                    new Ingrediente("Hueso duro de roer", 2)
            )),

            new Receta("Bonito parasol", "Escudos", List.of(
                    new Ingrediente("Pipa de la paz", 2),
                    new Ingrediente("Par de alas negras", 2),
                    new Ingrediente("Nomeolvides", 10)
            )),

            new Receta("Escudo de diosa", "Escudos", List.of(
                    new Ingrediente("Escudo místico", 1),
                    new Ingrediente("Lúminas", 5),
                    new Ingrediente("Par de alas de ángel", 5)
            )),

            new Receta("Escudo de escamas", "Escudos", List.of(
                    new Ingrediente("Escudo de cuero", 1),
                    new Ingrediente("Escama rígida", 1),
                    new Ingrediente("Campángula", 1)
            )),

            new Receta("Escudo de obsidiana", "Escudos", List.of(
                    new Ingrediente("Escudo de hierro", 1),
                    new Ingrediente("Cuenta de jade", 1),
                    new Ingrediente("Trozos de obsidiana", 3)
            )),

            new Receta("Escudo de paladín", "Escudos", List.of(
                    new Ingrediente("Escudo porcino", 1),
                    new Ingrediente("Ferrodiamantes", 2),
                    new Ingrediente("Trozos de obsidiana", 2)
            )),

            new Receta("Escudo místico", "Escudos", List.of(
                    new Ingrediente("Escudo vengador", 1),
                    new Ingrediente("Piedra del ímpetu", 1),
                    new Ingrediente("Champiluces", 5)
            )),

            new Receta("Escudo titánico", "Escudos", List.of(
                    new Ingrediente("Escudo de paladín", 1),
                    new Ingrediente("Caleidas", 5),
                    new Ingrediente("Papiro de la verdad", 5)
            )),

            new Receta("Toga de hechicero", "Túnicas y Mantos", List.of(
                    new Ingrediente("Hoja del Roble Ancestral", 3),
                    new Ingrediente("Piedra ritual", 3),
                    new Ingrediente("Semilla de discordia", 2)
            )),

            new Receta("Toga de las mareas", "Túnicas y Mantos", List.of(
                    new Ingrediente("Glaciolo", 2),
                    new Ingrediente("Empapiedra", 2),
                    new Ingrediente("Botella de aguafresca", 2)
            )),

            new Receta("Túnica de diosa", "Túnicas y Mantos", List.of(
                    new Ingrediente("Lúminas", 5),
                    new Ingrediente("Par de alas de ángel", 5),
                    new Ingrediente("Ojo avizor", 5)
            )),

            new Receta("Túnica de paladín", "Túnicas y Mantos", List.of(
                    new Ingrediente("Túnica de soldado", 1),
                    new Ingrediente("Trozo de madera azul", 2),
                    new Ingrediente("Barba de gnomo", 3)
            )),

            new Receta("Casco bendito", "Cascos", List.of(
                    new Ingrediente("Piedra gélida", 2),
                    new Ingrediente("Nomeolvides", 3),
                    new Ingrediente("Trozo de piel suave", 3)
            )),

            new Receta("Casco titánico", "Cascos", List.of(
                    new Ingrediente("Casco bendito", 1),
                    new Ingrediente("Ojo del mal", 5),
                    new Ingrediente("Papiro de la verdad", 5)
            )),

            new Receta("Yelmo de paladín", "Cascos", List.of(
                    new Ingrediente("Casco de soldado", 1),
                    new Ingrediente("Ferrodiamantes", 2),
                    new Ingrediente("Broquillos", 2)
            )),

            new Receta("Capas a rayas", "Capas", List.of(
                    new Ingrediente("Capa de serpiente", 1),
                    new Ingrediente("Trozo de piel suave", 1)
            )),

            new Receta("Capa ciclón", "Capas", List.of(
                    new Ingrediente("Capa hierbabuena", 1),
                    new Ingrediente("Flor de niebla", 1),
                    new Ingrediente("Glaciolo", 1)
            )),

            new Receta("Capa del águila", "Capas", List.of(
                    new Ingrediente("Pluma afilada", 1),
                    new Ingrediente("Glaciolo", 1),
                    new Ingrediente("Trozo de piel suave", 2)
            )),

            new Receta("Capa de paladín", "Capas", List.of(
                    new Ingrediente("Escama de acero", 1),
                    new Ingrediente("Ferrodiamantes", 2),
                    new Ingrediente("Broquillos", 2)
            )),

            new Receta("Capa hierbabuena", "Capas", List.of(
                    new Ingrediente("Capa oceánica", 1),
                    new Ingrediente("Campángula", 2)
            )),

            new Receta("Manto celestial", "Capas", List.of(
                    new Ingrediente("Capa del águila", 1),
                    new Ingrediente("Capa ciclón", 1),
                    new Ingrediente("Par de alas negras", 2)
            )),

            new Receta("Manto fantasma", "Capas", List.of(
                    new Ingrediente("Capa espectral", 1),
                    new Ingrediente("Bigolito", 2),
                    new Ingrediente("Prisma de fuego", 2)
            )),

            new Receta("Anillo córneo", "Colmillos y Anillos", List.of(
                    new Ingrediente("Lúminas", 5),
                    new Ingrediente("Roca con lágrimas de troll", 5),
                    new Ingrediente("Ojo avizor", 5)
            )),

            new Receta("Anillo soberano", "Colmillos y Anillos", List.of(
                    new Ingrediente("Anillo draconiano", 1),
                    new Ingrediente("Piedra ritual", 3),
                    new Ingrediente("Piedra ígnea", 3)
            )),

            new Receta("Collar engullealmas", "Colmillos y Anillos", List.of(
                    new Ingrediente("Anillo molar", 1),
                    new Ingrediente("Piedra ígnea", 1),
                    new Ingrediente("Flor ponzoña", 2)
            )),

            new Receta("Colmillo carmesí", "Colmillos y Anillos", List.of(
                    new Ingrediente("Piedra ígnea", 2),
                    new Ingrediente("Hueso duro de roer", 1),
                    new Ingrediente("Prisma de fuego", 2)
            )),

            new Receta("Colmillo venenoso", "Colmillos y Anillos", List.of(
                    new Ingrediente("Colmillo de gigante", 1),
                    new Ingrediente("Flor ponzoña", 1)
            )),

            new Receta("Insignia de blindaje", "Medallas e Insignias", List.of(
                    new Ingrediente("Insignia inflexible", 1),
                    new Ingrediente("Piedra ígnea", 2),
                    new Ingrediente("Semilla sonajero", 3)
            )),

            new Receta("Insignia de defensa", "Medallas e Insignias", List.of(
                    new Ingrediente("Escudo de hierro", 1),
                    new Ingrediente("Fragmento de meteorito", 2),
                    new Ingrediente("Engranaje", 2)
            )),

            new Receta("Insignia del delirio", "Medallas e Insignias", List.of(
                    new Ingrediente("Insignia estoica", 1),
                    new Ingrediente("Par de alas negras", 2),
                    new Ingrediente("Pompina", 2)
            )),

            new Receta("Insignia escudo", "Medallas e Insignias", List.of(
                    new Ingrediente("Insignia de robustez", 1),
                    new Ingrediente("Escudo porcino", 1),
                    new Ingrediente("Flor de niebla", 2)
            )),

            new Receta("Insignia estoica", "Medallas e Insignias", List.of(
                    new Ingrediente("Insignia de esfuerzo", 1),
                    new Ingrediente("Piedra del ímpetu", 2),
                    new Ingrediente("Cuenco de arroz blanco", 10)
            )),

            new Receta("Insignia guardiana", "Medallas e Insignias", List.of(
                    new Ingrediente("Insignia de robustez", 1),
                    new Ingrediente("Casco de soldado", 1),
                    new Ingrediente("Bigolito", 2)
            )),

            new Receta("Medalla de destreza", "Medallas e Insignias", List.of(
                    new Ingrediente("Espada de soldado", 1),
                    new Ingrediente("Campana grave", 1),
                    new Ingrediente("Engranaje", 1)
            )),

            new Receta("Medalla de firmeza", "Medallas e Insignias", List.of(
                    new Ingrediente("Escudo de hierro", 1),
                    new Ingrediente("Pompina", 2),
                    new Ingrediente("Campana grave", 2)
            )),

            new Receta("Medalla de inmunidad", "Medallas e Insignias", List.of(
                    new Ingrediente("Estraperla", 1),
                    new Ingrediente("Panacea", 3),
                    new Ingrediente("Champiluces", 3)
            )),

            new Receta("Omnisello", "Medallas e Insignias", List.of(
                    new Ingrediente("Par de alas de ángel", 5),
                    new Ingrediente("Ojo del mal", 5),
                    new Ingrediente("Ojo avizor", 5)
            )),

            new Receta("Sello de viento", "Medallas e Insignias", List.of(
                    new Ingrediente("Pluma afilada", 1),
                    new Ingrediente("Barba de gnomo", 2),
                    new Ingrediente("Campángula", 1)
            )),

            new Receta("Escama de obsidiana", "Escamas", List.of(
                    new Ingrediente("Cuenta de jade", 1),
                    new Ingrediente("Trozo de obsidiana", 3)
            )),

            new Receta("Escama de rey dragón", "Escamas", List.of(
                    new Ingrediente("Anillo draconiano", 1),
                    new Ingrediente("Estraperla", 2),
                    new Ingrediente("Piedra ígnea", 2)
            )),

            new Receta("Escama de salamandra", "Escamas", List.of(
                    new Ingrediente("Piedra ígnea", 1),
                    new Ingrediente("Semilla sonajero", 2),
                    new Ingrediente("Prisma de fuego", 2)
            )),

            new Receta("Escama índigo", "Escamas", List.of(
                    new Ingrediente("Piedra gélida", 1),
                    new Ingrediente("Cuenta de jade", 2),
                    new Ingrediente("Empapiedra", 2)
            )),

            new Receta("Escama recia", "Escamas", List.of(
                    new Ingrediente("Hueso duro de roer", 1),
                    new Ingrediente("Empapiedra", 1)
            )),

            new Receta("Bombones", "Caprichos", List.of(
                    new Ingrediente("Chocolatina", 2),
                    new Ingrediente("Flor de niebla", 2),
                    new Ingrediente("Tarro de miel de flobejorro", 2)
            )),

            new Receta("Bombones azules", "Caprichos", List.of(
                    new Ingrediente("Puñado de bombones", 1),
                    new Ingrediente("Puñado de caramelos", 2),
                    new Ingrediente("Copo de nieve", 1)
            )),

            new Receta("Brisa de nata", "Caprichos", List.of(
                    new Ingrediente("Pastelito", 2),
                    new Ingrediente("Puñado de caramelos", 2),
                    new Ingrediente("Pluma afilada", 1)
            )),

            new Receta("Chocolate con leche", "Caprichos", List.of(
                    new Ingrediente("Chocolatina", 1),
                    new Ingrediente("Botella de leche fresca", 1),
                    new Ingrediente("Tarro de miel de flobejorro", 1)
            )),

            new Receta("Chocolate de duende", "Caprichos", List.of(
                    new Ingrediente("Chocolatina de duende", 1),
                    new Ingrediente("Campángula", 1),
                    new Ingrediente("Nomeolvides", 1)
            )),

            new Receta("Delicia real", "Caprichos", List.of(
                    new Ingrediente("Sorbete tropical", 1),
                    new Ingrediente("Puñado de bayas regias", 1),
                    new Ingrediente("Babana reineta", 2)
            )),

            new Receta("Flan cremoso", "Caprichos", List.of(
                    new Ingrediente("Flan", 1),
                    new Ingrediente("Huevisferio", 2),
                    new Ingrediente("Tarro de miel de flobejorro", 1)
            )),

            new Receta("Flan de babana", "Caprichos", List.of(
                    new Ingrediente("Flan cremoso", 1),
                    new Ingrediente("Racimo de babanas", 2),
                    new Ingrediente("Barba de gnomo", 1)
            )),

            new Receta("Flan de frutas", "Caprichos", List.of(
                    new Ingrediente("Flan helado", 1),
                    new Ingrediente("Racimo de uvas verdes", 2),
                    new Ingrediente("Racimo de uvas agridulces", 1)
            )),

            new Receta("Flan helado", "Caprichos", List.of(
                    new Ingrediente("Flan", 2),
                    new Ingrediente("Copo de nieve", 1),
                    new Ingrediente("Tarro de miel de flobejorro", 2)
            )),

            new Receta("Flantástico", "Caprichos", List.of(
                    new Ingrediente("Flan de babana", 1),
                    new Ingrediente("Flan de frutas", 1),
                    new Ingrediente("Babana reineta", 2)
            )),

            new Receta("Gran perla estelar", "Caprichos", List.of(
                    new Ingrediente("Perla estelar", 1),
                    new Ingrediente("Cristal estelar", 3)
            )),

            new Receta("Gran perla lunar", "Caprichos", List.of(
                    new Ingrediente("Perla lunar", 1),
                    new Ingrediente("Cristal lunar", 3)
            )),

            new Receta("Gran perla planetaria", "Caprichos", List.of(
                    new Ingrediente("Perla planetaria", 1),
                    new Ingrediente("Cristal planetario", 3)
            )),

            new Receta("Gran perla solar", "Caprichos", List.of(
                    new Ingrediente("Perla solar", 1),
                    new Ingrediente("Cristal solar", 3)
            )),

            new Receta("Helado agridulce", "Caprichos", List.of(
                    new Ingrediente("Helado", 1),
                    new Ingrediente("Puñado de brotenciadores", 1)
            )),

            new Receta("Helado arcoíris", "Caprichos", List.of(
                    new Ingrediente("Helado rubí", 1),
                    new Ingrediente("Racimo de uvas agridulces", 1),
                    new Ingrediente("Puñados de bayas regias", 2)
            )),

            new Receta("Helado etéreo", "Caprichos", List.of(
                    new Ingrediente("Helado agridulce", 1),
                    new Ingrediente("Racimo de uvas verdes", 2),
                    new Ingrediente("Barba de gnomo", 1)
            )),

            new Receta("Helado rubí", "Caprichos", List.of(
                    new Ingrediente("Helado agridulce", 1),
                    new Ingrediente("Zanahoria fresca", 2),
                    new Ingrediente("Prisma de fuego", 1)
            )),

            new Receta("Leche merengada", "Caprichos", List.of(
                    new Ingrediente("Helado etéreo", 1),
                    new Ingrediente("Cuenco de yogur", 2),
                    new Ingrediente("Copo de nieve", 1)
            )),

            new Receta("Pastel crujiente", "Caprichos", List.of(
                    new Ingrediente("Pastel", 1),
                    new Ingrediente("Zanahoria fresca", 3)
            )),

            new Receta("Pastel de carne", "Caprichos", List.of(
                    new Ingrediente("Pastel crujiente", 1),
                    new Ingrediente("Filete de ternera", 2),
                    new Ingrediente("Semilla sonajero", 1)
            )),

            new Receta("Pastel dorado", "Caprichos", List.of(
                    new Ingrediente("Pastel flotante", 1),
                    new Ingrediente("Racimo de babanas", 2),
                    new Ingrediente("Babana reineta", 2)
            )),

            new Receta("Pastel en flor", "Caprichos", List.of(
                    new Ingrediente("Tarta de zanahoria", 1),
                    new Ingrediente("Huevisferio", 2),
                    new Ingrediente("Campángula", 1)
            )),

            new Receta("Pastel flotante", "Caprichos", List.of(
                    new Ingrediente("Pastel crujiente", 1),
                    new Ingrediente("Cuenco de yogur", 2),
                    new Ingrediente("Botella de aguafresca", 1)
            )),

            new Receta("Pastel moruno", "Caprichos", List.of(
                    new Ingrediente("Pastel de carne", 1),
                    new Ingrediente("Hueso duro de roer", 1),
                    new Ingrediente("Trozo de madera azul", 1)
            )),

            new Receta("Postre de princesa", "Caprichos", List.of(
                    new Ingrediente("Chocolatina de duende", 1),
                    new Ingrediente("Puñado de bombones azules", 1),
                    new Ingrediente("Puñados de bayas regias", 2)
            )),

            new Receta("Sorbete de alcachofa", "Caprichos", List.of(
                    new Ingrediente("Sorbete de setas", 1),
                    new Ingrediente("Puñados de brotenciadores", 2),
                    new Ingrediente("Rábano polar", 2)
            )),

            new Receta("Sorbete de naranja", "Caprichos", List.of(
                    new Ingrediente("Sorbete", 1),
                    new Ingrediente("Cuenco de yogur", 3)
            )),

            new Receta("Sorbete de setas", "Caprichos", List.of(
                    new Ingrediente("Sorbete", 2),
                    new Ingrediente("Champiluz", 1),
                    new Ingrediente("Trufa negra", 2)
            )),

            new Receta("Sorbete tropical", "Caprichos", List.of(
                    new Ingrediente("Sorbete de naranja", 1),
                    new Ingrediente("Margarilla", 1),
                    new Ingrediente("Nomeolvides", 1)
            )),

            new Receta("Tarta de almendras", "Caprichos", List.of(
                    new Ingrediente("Brisa de nata", 1),
                    new Ingrediente("Semilla sonajero", 1),
                    new Ingrediente("Piedra del ímpetu", 1)
            )),

            new Receta("Tarta de zanahoria", "Caprichos", List.of(
                    new Ingrediente("Pastelito", 1),
                    new Ingrediente("Zanahoria fresca", 3)
            )),

            new Receta("Tarta flambeada", "Caprichos", List.of(
                    new Ingrediente("Pastel en flor", 1),
                    new Ingrediente("Piedra ígnea", 1),
                    new Ingrediente("Puñados de bayas regias", 2)
            )),

            new Receta("Aliento de Fénix", "Provisiones", List.of(
                    new Ingrediente("Pluma de Fénix", 1),
                    new Ingrediente("Piedra gélida", 1),
                    new Ingrediente("Margarilla", 3)
            )),

            new Receta("Bálsamo", "Provisiones", List.of(
                    new Ingrediente("Rocío de hadas", 1),
                    new Ingrediente("Hoja del Roble Ancestral", 2),
                    new Ingrediente("Semilla de discordia", 2)
            )),

            new Receta("Café cargado", "Provisiones", List.of(
                    new Ingrediente("Botella de granizado de café", 2),
                    new Ingrediente("Botella de aguafresca", 1)
            )),

            new Receta("Café solo", "Provisiones", List.of(
                    new Ingrediente("Taza de café cargado", 2),
                    new Ingrediente("Flor de niebla", 1),
                    new Ingrediente("Manojo de hierba del despertar", 3)
            )),

            new Receta("Capuchino", "Provisiones", List.of(
                    new Ingrediente("Taza de café cargado", 1),
                    new Ingrediente("Botella de leche fresca", 3),
                    new Ingrediente("Manojo de hierba del despertar", 1)
            )),

            new Receta("Hamburguesa", "Provisiones", List.of(
                    new Ingrediente("Sándwich", 1),
                    new Ingrediente("Lechuga fresca", 1),
                    new Ingrediente("Gamba zafiro", 1)
            )),

            new Receta("Panacea", "Provisiones", List.of(
                    new Ingrediente("Puñado de hojas del Roble Ancestral", 1),
                    new Ingrediente("Margarilla", 1),
                    new Ingrediente("Puñado de brotenciadores", 1)
            )),

            new Receta("Pezburguesa", "Provisiones", List.of(
                    new Ingrediente("Panecillo", 2),
                    new Ingrediente("Besugo", 1),
                    new Ingrediente("Lechuga fresca", 1)
            )),

            new Receta("Rocío de duende", "Provisiones", List.of(
                    new Ingrediente("Rocío de hadas", 1),
                    new Ingrediente("Racimo de uvas agridulces", 1),
                    new Ingrediente("Manojo de hierba del despertar", 3)
            )),

            new Receta("Rocío de hadas", "Provisiones", List.of(
                    new Ingrediente("Flor de niebla", 1),
                    new Ingrediente("Puñado de brotenciadores", 3),
                    new Ingrediente("Botella de aguafresca", 3)
            )),

            new Receta("Sándwich", "Provisiones", List.of(
                    new Ingrediente("Panecillo", 1),
                    new Ingrediente("Filete de ternera", 1)
            )),

            new Receta("Suero de sabio", "Provisiones", List.of(
                    new Ingrediente("Bálsamo", 1),
                    new Ingrediente("Copo de nieve", 1),
                    new Ingrediente("Champiluces", 3)
            ))

    );
}
