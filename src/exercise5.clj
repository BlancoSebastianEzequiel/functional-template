(ns exercise5)

"Escriba una función (sumar) que devuelva 
la suma de una secuencia de números. La misma
debe satisfacer los tests que se muestran."

( defn sumar [list]  (reduce + 0 list) )
