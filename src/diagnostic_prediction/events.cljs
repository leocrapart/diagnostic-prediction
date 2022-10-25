(ns diagnostic-prediction.events
  (:require
   [re-frame.core :as re-frame]
   [diagnostic-prediction.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
