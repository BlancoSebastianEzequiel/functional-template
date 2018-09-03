(ns exercise4)

(defn fibonacci [n] 
	(if (<= n 1) 
		num 
		(+ (fibonacci (- n 1)) (fibonacci (- n 2)))
	)
)
