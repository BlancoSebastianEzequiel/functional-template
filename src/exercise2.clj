(ns exercise2)

(defn only-greater-than-five [list] (filter (fn [num] (> num 5)) list))
