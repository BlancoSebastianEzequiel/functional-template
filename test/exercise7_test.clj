(ns exercise7-test
  (:require [clojure.test :refer :all]
              [exercise7 :refer :all]))

(deftest fmap-list
  	(testing "second-element"
		( is (= (enesimo 2 '(4 5 6 7)) 6) )
	)
)

(deftest fmap-list
  	(testing "second-element"
		(is (= (enesimo 0 [:a :b :c]) :a))
	)
)

(deftest fmap-list
  	(testing "second-element"
		(is (= (enesimo 1 [1 2 3 4]) 2))
	)
)

(deftest fmap-list
  	(testing "second-element"
		(is (= (enesimo 2 '([1 2] [3 4] [5 6])) [5 6]))
	)
)
   

