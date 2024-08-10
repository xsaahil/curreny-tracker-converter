import React from "react";
import { StyleSheet, Text, View } from "react-native";
import GradientText from "./GradientText";
import { LinearGradient } from "expo-linear-gradient";

export default function AnimatedCurrencyHeader() {
  return (
    <LinearGradient
      colors={["#121212", "#247940"]}
      start={{ x: 0.3, y: 0.1 }}
      end={{ x: 1, y: 0.6 }}
      style={styles.container}
    >
      <GradientText
        colors={["#00CE2C", "#AEDF23", "#A3DC00"]}
        style={styles.text}
      >
        {`Currency\n Tracker`}
      </GradientText>
      <Text style={styles.subText}>
        Dollar exchange rate and other international currencies.
      </Text>
    </LinearGradient>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 0.4,
    width: "100%",
    backgroundColor: "#ffefd5",
    justifyContent: "space-around",
    alignItems: "center",
    borderWidth: 0
  },
  text: {
    fontSize: 38,
    fontWeight: "800",
  },
  subText: {
    color: "#D9D9D9",
    fontSize: 12,
    textAlign: 'center',
    width: '60%',
  },
});
