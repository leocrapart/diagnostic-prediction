(ns diagnostic-prediction.views
  (:require
   [re-frame.core :as re-frame]
   [diagnostic-prediction.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      "Hello from " @name]
     ]))


; x
; y   -> diagnostic
; z


; vars = 
; {:x 0.5
;  :y 10
;  :z 1}

; fc: frequence cardiaque
; c:  cianose
; t:  tension

; si t> x :
;  diagnostics qui existent à ce sujet

; si deux infos contradictoires : 
;   enlever certains diagnostics/leur donner un score de pertinence plus faible

; diagnostic = 
; {:title 
;  :text
;  :images?
;  :url
;  :pertinence}


; diagnosis vs prognosis
; https://pubmed.ncbi.nlm.nih.gov/33775387/
; diagnosis = % of disease in present
; prognosis = % of disease in futur





;; roadmap
; 5 maladies cardiaques
; tout le coeur
; les poumons
; ...
; tous les organes



;; client 
; landes, milieu reculé sans médecins
; logiciel validé par le samu
; médecin seul apte à déclarer le décès
; infirmières à domicile
; appeler le samu ou pas
; urgence urgence ou ambulance demain hopital