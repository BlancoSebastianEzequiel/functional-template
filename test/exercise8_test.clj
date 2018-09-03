(ns exercise8-test
  (:require [clojure.test :refer :all]
              [exercise8 :refer :all]))

(deftest separate-list
  	(testing "separate-list-of-numbers"
		(is 
			(= (separador 3 [1 2 3 4 5 6]) ['(1 2 3) '(4 5 6)]) 
		)
	)
)
   

(deftest separate-list
  	(testing "separate hash-map"
		(is 
			(  = (separador 1 [:a :b :c :d]) ['(:a) '(:b :c :d)] ) 
		)
	)
)

(deftest separate-list
  	(testing "separate-list-of-lists"
		(is 
			(  = (separador 2 [[1 2] [3 4] [5 6]]) ['([1 2] [3 4]) '([5 6])] ) 
		)
	)
)

