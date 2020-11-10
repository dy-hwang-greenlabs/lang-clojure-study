(require '[clojure.string :as str])

;Description:
;Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
;Examples:
;(solution "abc" "bc") ; returns true
;(solution "abc" "d'" ; returns false


(defn solution [strng ending]
(let [str_length (count strng) end_length (count ending)]
  (if (>= str_length end_length) (if (= 0 (compare ending (subs strng (- str_length end_length) str_length)))
                                    true
                                    false)
      false)
  )
)


(defn solution2 [strng ending]
  (str/ends-with? strng ending)
)