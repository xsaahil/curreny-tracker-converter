import CurrencyHeader from "@/components/currency/CurrencyHeader";
import CurrencyItem from "@/components/currency/CurrencyItem";
import { Spacing } from "@/components/currency/Spacing";
import AnimatedCurrencyHeader from "@/components/header/AnimatedCurrencyHeader";
import { FlatList, StyleSheet, Text, View } from "react-native";

const DATA = [
  {
    id: "bd7acbea-c1b1-46c2-aed5-3ad53abb28ba",
    title: "First Item",
  },
  {
    id: "3ac68afc-c605-48d3-a4f8-fbd91aa97f63",
    title: "Second Item",
  },
  {
    id: "58694a0f-3da1-471f-bd96-145571e29d72",
    title: "Third Item",
  },
];

export default function HomeScreen() {
  return (
    <View style={styles.mainContainer}>
      <AnimatedCurrencyHeader />
      <View style={styles.subContainer}>
        <View style={styles.lastUpdatedContainer}>
          <View style={styles.dot} />
          <Text style={styles.lastUpdated}>Last updated at 11:59 pm</Text>
        </View>
        <FlatList
          data={DATA}
          renderItem={CurrencyItem}
          ListHeaderComponent={CurrencyHeader}
        />
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  mainContainer: {
    backgroundColor: "#030304",
    flex: 1,
  },
  subContainer: {
    paddingHorizontal: 20,
  },
  lastUpdatedContainer: {
    flexDirection: "row",
    justifyContent: "center",
    alignItems: "center",
    paddingVertical: 20
  },
  lastUpdated: {
    fontSize: 12,
    lineHeight: 22,
    color: "#D9D9D9",
    alignSelf: "center",
    marginLeft: 8
  },
  dot: {
    height: 8,
    width: 8,
    borderRadius: 4,
    backgroundColor: "#00BC4F",
  },
});
